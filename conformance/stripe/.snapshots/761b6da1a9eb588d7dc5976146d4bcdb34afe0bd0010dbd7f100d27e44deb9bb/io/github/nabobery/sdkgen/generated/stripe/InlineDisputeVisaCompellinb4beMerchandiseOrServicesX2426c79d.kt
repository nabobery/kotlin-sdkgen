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
 * Categorization of disputed payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_visa_compelling_evidence3_disputed_transaction/properties/me
 * rchandise_or_services
 */
@Serializable(with = InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d.Serializer::class)
public sealed class InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merchandise`.
   */
  public data object Merchandise : InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d() {
    public override val `value`: String = "merchandise"
  }

  /**
   * Documented value. Wire value: `services`.
   */
  public data object Services : InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d() {
    public override val `value`: String = "services"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d()

  public companion object {
    public fun fromValue(`value`: String): InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d = when (value) {
      Merchandise.value -> Merchandise
      Services.value -> Services
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDisputeVisaCompellinb4beMerchandiseOrServicesX2426c79d) {
      encoder.encodeString(value.value)
    }
  }
}
