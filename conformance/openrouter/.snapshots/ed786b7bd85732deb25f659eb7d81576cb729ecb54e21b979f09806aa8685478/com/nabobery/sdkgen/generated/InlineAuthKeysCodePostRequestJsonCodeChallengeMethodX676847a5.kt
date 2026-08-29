package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/requestBody/content/application~1json/schema/properties/c
 * ode_challenge_method
 */
@Serializable(with = InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5.Serializer::class)
public sealed class InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `S256`.
   */
  public data object S256 : InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5() {
    public override val `value`: String = "S256"
  }

  /**
   * Documented value. Wire value: `plain`.
   */
  public data object Plain : InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5() {
    public override val `value`: String = "plain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5()

  public companion object {
    public fun fromValue(`value`: String): InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5 = when (value) {
      S256.value -> S256
      Plain.value -> Plain
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysCodePostRequestJsonCodeChallengeMethodX676847a5) {
      encoder.encodeString(value.value)
    }
  }
}
