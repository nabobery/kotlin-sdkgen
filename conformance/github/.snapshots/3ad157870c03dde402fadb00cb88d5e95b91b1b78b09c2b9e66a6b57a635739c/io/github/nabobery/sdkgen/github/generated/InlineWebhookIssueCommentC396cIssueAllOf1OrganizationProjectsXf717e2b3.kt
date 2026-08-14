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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/organization_projects.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pe
 * rformed_via_github_app/properties/permissions/properties/organization_projects
 */
@Serializable(with = InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3.Serializer::class)
public sealed class InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentC396cIssueAllOf1OrganizationProjectsXf717e2b3) {
      encoder.encodeString(value.value)
    }
  }
}
