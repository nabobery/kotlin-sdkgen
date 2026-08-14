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
 * The method used to generate the code challenge
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys/post/requestBody/content/application~1json/schema/properties/code_ch
 * allenge_method
 */
@Serializable(with = InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff.Serializer::class)
public sealed class InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `S256`.
   */
  public data object S256 : InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff() {
    public override val `value`: String = "S256"
  }

  /**
   * Documented value. Wire value: `plain`.
   */
  public data object Plain : InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff() {
    public override val `value`: String = "plain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff()

  public companion object {
    public fun fromValue(`value`: String): InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff = when (value) {
      S256.value -> S256
      Plain.value -> Plain
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysPostRequestJsonCodeChallengeMethodXc0f3e8ff) {
      encoder.encodeString(value.value)
    }
  }
}
