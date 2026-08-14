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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatGrammarConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatGrammarConfig/properties/type
 */
@Serializable(with = InlineChatFormatGrammarConfigTypeX48ad27f4.Serializer::class)
public sealed class InlineChatFormatGrammarConfigTypeX48ad27f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grammar`.
   */
  public data object Grammar : InlineChatFormatGrammarConfigTypeX48ad27f4() {
    public override val `value`: String = "grammar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFormatGrammarConfigTypeX48ad27f4()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFormatGrammarConfigTypeX48ad27f4 = when (value) {
      Grammar.value -> Grammar
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFormatGrammarConfigTypeX48ad27f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatFormatGrammarConfigTypeX48ad27f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFormatGrammarConfigTypeX48ad27f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFormatGrammarConfigTypeX48ad27f4) {
      encoder.encodeString(value.value)
    }
  }
}
