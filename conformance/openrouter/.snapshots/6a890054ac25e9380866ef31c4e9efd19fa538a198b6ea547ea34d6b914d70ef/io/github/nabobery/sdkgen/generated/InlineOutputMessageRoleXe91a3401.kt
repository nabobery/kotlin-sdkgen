package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/role
 */
@Serializable(with = InlineOutputMessageRoleXe91a3401.Serializer::class)
public sealed class InlineOutputMessageRoleXe91a3401 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineOutputMessageRoleXe91a3401() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessageRoleXe91a3401()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessageRoleXe91a3401 = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageRoleXe91a3401> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputMessageRoleXe91a3401", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessageRoleXe91a3401 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageRoleXe91a3401) {
      encoder.encodeString(value.value)
    }
  }
}
