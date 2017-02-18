package me.creepinson.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class CustomPacket implements IMessage{
	  
	// A default constructor is always required
	  public CustomPacket(BlockPos pos){}
	  public static BlockPos pos;
	  public static int toSend;

	  public static int posX;
	  public static int posY;
	  public static int posZ;
	  
	  public CustomPacket(int toSend) {
	    this.toSend = toSend;
	   
	  }

	  @Override public void toBytes(ByteBuf buf) {
	  buf.writeInt(posX);
	  buf.writeInt(posY);
	  buf.writeInt(posZ);
	    buf.writeInt(toSend);
	  }

	  @Override public void fromBytes(ByteBuf buf) {
	    // Reads the int back from the buf. Note that if you have multiple values, you must read in the same order you wrote.
		toSend = buf.readInt();
		  posX = buf.readInt();
		  posY = buf.readInt();
		  posZ = buf.readInt();
	  
	  }
	}



