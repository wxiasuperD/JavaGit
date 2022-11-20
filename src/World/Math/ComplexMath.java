package World.Math;

public class ComplexMath {

		int exp(int base, int index)
		{
			if(index ==0)
				return 1;
			else
			{
				int result=1;
				for(int i=0;i<index;i++)
					result*=base;
				return result;
			}
		}
}
