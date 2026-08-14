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
 * Action to apply to the fine-grained personal access token.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens~1{pat_id}/post/requestBody/content/applicat
 * ion~1json/schema/properties/action
 */
@Serializable(with = InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542.Serializer::class)
public sealed class InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `revoke`.
   */
  public data object Revoke : InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542() {
    public override val `value`: String = "revoke"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542 = when (value) {
      Revoke.value -> Revoke
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokensPostRequestJsonActionXebabf542) {
      encoder.encodeString(value.value)
    }
  }
}
