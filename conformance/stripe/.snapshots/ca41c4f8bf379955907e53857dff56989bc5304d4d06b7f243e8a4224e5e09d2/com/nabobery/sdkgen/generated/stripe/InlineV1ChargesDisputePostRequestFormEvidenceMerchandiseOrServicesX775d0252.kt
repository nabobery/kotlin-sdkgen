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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/merchandise_or_services.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/merchandise_or_services
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252.Serializer::class)
public sealed class InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchandise`.
   */
  public data object Merchandise : InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252() {
    public override val `value`: String = "merchandise"
  }

  /**
   * Documented value. Wire value: `services`.
   */
  public data object Services : InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252() {
    public override val `value`: String = "services"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252 = when (value) {
      Merchandise.value -> Merchandise
      Services.value -> Services
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceMerchandiseOrServicesX775d0252) {
      encoder.encodeString(value.value)
    }
  }
}
