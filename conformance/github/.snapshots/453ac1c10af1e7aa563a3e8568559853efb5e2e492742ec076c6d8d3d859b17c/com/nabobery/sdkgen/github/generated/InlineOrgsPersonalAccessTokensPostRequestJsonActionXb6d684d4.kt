package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Action to apply to the fine-grained personal access token.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens/post/requestBody/content/application~1json/
 * schema/properties/action
 */
@Serializable(with = InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4.Serializer::class)
public sealed class InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `revoke`.
   */
  public data object Revoke : InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4() {
    public override val `value`: String = "revoke"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4 = when (value) {
      Revoke.value -> Revoke
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4) {
      encoder.encodeString(value.value)
    }
  }
}
