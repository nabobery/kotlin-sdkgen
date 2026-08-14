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
 * The bypass type of the user making the API request for this ruleset. This field is only returned when
 * querying the repository-level endpoint.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-ruleset/properties/current_user_can_bypass
 */
@Serializable(with = InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd.Serializer::class)
public sealed class InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `pull_requests_only`.
   */
  public data object PullRequestsOnly : InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd() {
    public override val `value`: String = "pull_requests_only"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd() {
    public override val `value`: String = "never"
  }

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd() {
    public override val `value`: String = "exempt"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd = when (value) {
      Always.value -> Always
      PullRequestsOnly.value -> PullRequestsOnly
      Never.value -> Never
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulesetCurrentUserCanBypassX9c4efdcd) {
      encoder.encodeString(value.value)
    }
  }
}
