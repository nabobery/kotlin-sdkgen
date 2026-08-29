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
 * The processor used for this payment attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_processor_details/prope
 * rties/type
 */
@Serializable(with = InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af.Serializer::class)
public sealed class InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPaymentRecordsResourceProcessorDetailsTypeXb87541af) {
      encoder.encodeString(value.value)
    }
  }
}
