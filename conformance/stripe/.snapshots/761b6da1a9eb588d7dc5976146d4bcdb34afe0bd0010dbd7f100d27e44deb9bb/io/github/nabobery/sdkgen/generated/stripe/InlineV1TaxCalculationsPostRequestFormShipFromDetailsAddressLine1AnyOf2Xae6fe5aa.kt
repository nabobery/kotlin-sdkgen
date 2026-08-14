package io.github.nabobery.sdkgen.generated.stripe

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
 * ed/schema/properties/ship_from_details/properties/address/properties/line1/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/line1/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressLine1AnyOf2Xae6fe5aa) {
      encoder.encodeString(value.value)
    }
  }
}
