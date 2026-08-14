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
 * The user's verified id number type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verified_outputs/properties/id_number_type
 */
@Serializable(with = InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d.Serializer::class)
public sealed class InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `br_cpf`.
   */
  public data object BrCpf : InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d() {
    public override val `value`: String = "br_cpf"
  }

  /**
   * Documented value. Wire value: `sg_nric`.
   */
  public data object SgNric : InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d() {
    public override val `value`: String = "sg_nric"
  }

  /**
   * Documented value. Wire value: `us_ssn`.
   */
  public data object UsSsn : InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d() {
    public override val `value`: String = "us_ssn"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d = when (value) {
      BrCpf.value -> BrCpf
      SgNric.value -> SgNric
      UsSsn.value -> UsSsn
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d) {
      encoder.encodeString(value.value)
    }
  }
}
