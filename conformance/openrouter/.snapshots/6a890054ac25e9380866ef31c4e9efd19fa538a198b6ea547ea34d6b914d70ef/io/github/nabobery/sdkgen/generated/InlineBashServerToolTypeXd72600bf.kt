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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BashServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BashServerTool/properties/type
 */
@Serializable(with = InlineBashServerToolTypeXd72600bf.Serializer::class)
public sealed class InlineBashServerToolTypeXd72600bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:bash`.
   */
  public data object OpenrouterBash : InlineBashServerToolTypeXd72600bf() {
    public override val `value`: String = "openrouter:bash"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBashServerToolTypeXd72600bf()

  public companion object {
    public fun fromValue(`value`: String): InlineBashServerToolTypeXd72600bf = when (value) {
      OpenrouterBash.value -> OpenrouterBash
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBashServerToolTypeXd72600bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBashServerToolTypeXd72600bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBashServerToolTypeXd72600bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBashServerToolTypeXd72600bf) {
      encoder.encodeString(value.value)
    }
  }
}
