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
 * The type of content tracked in a project item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-item-content-type
 */
@Serializable(with = ProjectsV2ItemContentType.Serializer::class)
public sealed class ProjectsV2ItemContentType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Issue`.
   */
  public data object Issue : ProjectsV2ItemContentType() {
    public override val `value`: String = "Issue"
  }

  /**
   * Documented value. Wire value: `PullRequest`.
   */
  public data object PullRequest : ProjectsV2ItemContentType() {
    public override val `value`: String = "PullRequest"
  }

  /**
   * Documented value. Wire value: `DraftIssue`.
   */
  public data object DraftIssue : ProjectsV2ItemContentType() {
    public override val `value`: String = "DraftIssue"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ProjectsV2ItemContentType()

  public companion object {
    public fun fromValue(`value`: String): ProjectsV2ItemContentType = when (value) {
      Issue.value -> Issue
      PullRequest.value -> PullRequest
      DraftIssue.value -> DraftIssue
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ProjectsV2ItemContentType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.ProjectsV2ItemContentType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ProjectsV2ItemContentType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ProjectsV2ItemContentType) {
      encoder.encodeString(value.value)
    }
  }
}
