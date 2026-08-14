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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_canceled/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_canceled/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b.Serializer::class)
public sealed class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b) {
      encoder.encodeString(value.value)
    }
  }
}
