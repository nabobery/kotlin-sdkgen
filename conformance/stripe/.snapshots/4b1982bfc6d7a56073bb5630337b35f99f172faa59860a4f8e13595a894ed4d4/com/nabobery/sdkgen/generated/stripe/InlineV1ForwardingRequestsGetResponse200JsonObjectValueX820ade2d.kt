package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/get/responses/200/content/application~1json/schema/pro
 * perties/object
 */
@Serializable(with = InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d.Serializer::class)
public sealed class InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ForwardingRequestsGetResponse200JsonObjectValueX820ade2d) {
      encoder.encodeString(value.value)
    }
  }
}
