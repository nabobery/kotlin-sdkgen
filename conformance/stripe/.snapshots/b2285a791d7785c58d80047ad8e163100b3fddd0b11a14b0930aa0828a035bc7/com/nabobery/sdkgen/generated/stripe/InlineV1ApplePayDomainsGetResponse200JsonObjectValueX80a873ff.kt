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
 * sdkgen://source/openapi.json#/paths/~1v1~1apple_pay~1domains/get/responses/200/content/application~1json/schema/prope
 * rties/object
 */
@Serializable(with = InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff.Serializer::class)
public sealed class InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ApplePayDomainsGetResponse200JsonObjectValueX80a873ff) {
      encoder.encodeString(value.value)
    }
  }
}
