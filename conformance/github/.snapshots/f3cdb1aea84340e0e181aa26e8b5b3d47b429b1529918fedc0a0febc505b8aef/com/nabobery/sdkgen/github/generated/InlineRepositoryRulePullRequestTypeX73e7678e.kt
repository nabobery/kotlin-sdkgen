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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-pull-request/properties/type
 */
@Serializable(with = InlineRepositoryRulePullRequestTypeX73e7678e.Serializer::class)
public sealed class InlineRepositoryRulePullRequestTypeX73e7678e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineRepositoryRulePullRequestTypeX73e7678e() {
    public override val `value`: String = "pull_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRulePullRequestTypeX73e7678e()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRulePullRequestTypeX73e7678e = when (value) {
      PullRequest.value -> PullRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRulePullRequestTypeX73e7678e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRulePullRequestTypeX73e7678e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRulePullRequestTypeX73e7678e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRulePullRequestTypeX73e7678e) {
      encoder.encodeString(value.value)
    }
  }
}
