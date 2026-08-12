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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax/properties/validate_location.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax/properties/validate_location
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deferred`.
   */
  public data object Deferred : InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13() {
    public override val `value`: String = "deferred"
  }

  /**
   * Documented value. Wire value: `immediately`.
   */
  public data object Immediately : InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13() {
    public override val `value`: String = "immediately"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13 = when (value) {
      Deferred.value -> Deferred
      Immediately.value -> Immediately
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormTaxValidateLocationXcb50ae13) {
      encoder.encodeString(value.value)
    }
  }
}
