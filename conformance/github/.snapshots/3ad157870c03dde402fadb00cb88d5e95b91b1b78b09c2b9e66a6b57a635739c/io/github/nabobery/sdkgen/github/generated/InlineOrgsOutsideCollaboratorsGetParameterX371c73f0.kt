package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1outside_collaborators/get/parameters/1/schema
 */
@Serializable(with = InlineOrgsOutsideCollaboratorsGetParameterX371c73f0.Serializer::class)
public sealed class InlineOrgsOutsideCollaboratorsGetParameterX371c73f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `2fa_disabled`.
   */
  public data object _2faDisabled : InlineOrgsOutsideCollaboratorsGetParameterX371c73f0() {
    public override val `value`: String = "2fa_disabled"
  }

  /**
   * Documented value. Wire value: `2fa_insecure`.
   */
  public data object _2faInsecure : InlineOrgsOutsideCollaboratorsGetParameterX371c73f0() {
    public override val `value`: String = "2fa_insecure"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsOutsideCollaboratorsGetParameterX371c73f0() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsOutsideCollaboratorsGetParameterX371c73f0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsOutsideCollaboratorsGetParameterX371c73f0 = when (value) {
      _2faDisabled.value -> _2faDisabled
      _2faInsecure.value -> _2faInsecure
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsOutsideCollaboratorsGetParameterX371c73f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsOutsideCollaboratorsGetParameterX371c73f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsOutsideCollaboratorsGetParameterX371c73f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsOutsideCollaboratorsGetParameterX371c73f0) {
      encoder.encodeString(value.value)
    }
  }
}
