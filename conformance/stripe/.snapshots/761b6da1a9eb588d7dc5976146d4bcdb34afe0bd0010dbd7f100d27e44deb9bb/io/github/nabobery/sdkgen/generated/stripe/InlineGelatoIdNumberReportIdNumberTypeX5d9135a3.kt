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
 * Type of ID number.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report/properties/id_number_type
 */
@Serializable(with = InlineGelatoIdNumberReportIdNumberTypeX5d9135a3.Serializer::class)
public sealed class InlineGelatoIdNumberReportIdNumberTypeX5d9135a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `br_cpf`.
   */
  public data object BrCpf : InlineGelatoIdNumberReportIdNumberTypeX5d9135a3() {
    public override val `value`: String = "br_cpf"
  }

  /**
   * Documented value. Wire value: `sg_nric`.
   */
  public data object SgNric : InlineGelatoIdNumberReportIdNumberTypeX5d9135a3() {
    public override val `value`: String = "sg_nric"
  }

  /**
   * Documented value. Wire value: `us_ssn`.
   */
  public data object UsSsn : InlineGelatoIdNumberReportIdNumberTypeX5d9135a3() {
    public override val `value`: String = "us_ssn"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoIdNumberReportIdNumberTypeX5d9135a3()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoIdNumberReportIdNumberTypeX5d9135a3 = when (value) {
      BrCpf.value -> BrCpf
      SgNric.value -> SgNric
      UsSsn.value -> UsSsn
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoIdNumberReportIdNumberTypeX5d9135a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoIdNumberReportIdNumberTypeX5d9135a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoIdNumberReportIdNumberTypeX5d9135a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoIdNumberReportIdNumberTypeX5d9135a3) {
      encoder.encodeString(value.value)
    }
  }
}
