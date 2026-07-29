package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Action to apply to the request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests~1{pat_request_id}/post/requestBody/
 * content/application~1json/schema/properties/action
 */
@Serializable(with = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01.Serializer::class)
public sealed class InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approve`.
   */
  public data object Approve : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01() {
    public override val `value`: String = "approve"
  }

  /**
   * Documented value. Wire value: `deny`.
   */
  public data object Deny : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01() {
    public override val `value`: String = "deny"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01 = when (value) {
      Approve.value -> Approve
      Deny.value -> Deny
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionXf201ee01) {
      encoder.encodeString(value.value)
    }
  }
}
