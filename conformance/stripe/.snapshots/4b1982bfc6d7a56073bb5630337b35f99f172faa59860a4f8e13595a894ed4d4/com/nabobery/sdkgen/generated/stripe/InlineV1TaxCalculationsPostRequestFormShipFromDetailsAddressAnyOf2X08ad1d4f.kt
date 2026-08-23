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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/postal_code/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f) {
      encoder.encodeString(value.value)
    }
  }
}
