import ResponseDto from "../response.dto";

export default interface SignResponseDto extends ResponseDto {
    token : string;
    expirationTime:number;
}