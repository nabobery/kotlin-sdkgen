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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-copilot-code-review/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-copilot-code-review/properties/type
 */
@Serializable(with = InlineRepositoryRuleCopilotCodeReviewTypeX9668c647.Serializer::class)
public sealed class InlineRepositoryRuleCopilotCodeReviewTypeX9668c647 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `copilot_code_review`.
   */
  public data object CopilotCodeReview : InlineRepositoryRuleCopilotCodeReviewTypeX9668c647() {
    public override val `value`: String = "copilot_code_review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleCopilotCodeReviewTypeX9668c647()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleCopilotCodeReviewTypeX9668c647 = when (value) {
      CopilotCodeReview.value -> CopilotCodeReview
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCopilotCodeReviewTypeX9668c647> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCopilotCodeReviewTypeX9668c647", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCopilotCodeReviewTypeX9668c647 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647) {
      encoder.encodeString(value.value)
    }
  }
}
