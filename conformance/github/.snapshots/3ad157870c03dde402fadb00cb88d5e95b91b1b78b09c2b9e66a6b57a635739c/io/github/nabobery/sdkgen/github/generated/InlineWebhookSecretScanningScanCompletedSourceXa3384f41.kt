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
 * What type of content was scanned
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed/properties/source
 */
@Serializable(with = InlineWebhookSecretScanningScanCompletedSourceXa3384f41.Serializer::class)
public sealed class InlineWebhookSecretScanningScanCompletedSourceXa3384f41 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `git`.
   */
  public data object Git : InlineWebhookSecretScanningScanCompletedSourceXa3384f41() {
    public override val `value`: String = "git"
  }

  /**
   * Documented value. Wire value: `issues`.
   */
  public data object Issues : InlineWebhookSecretScanningScanCompletedSourceXa3384f41() {
    public override val `value`: String = "issues"
  }

  /**
   * Documented value. Wire value: `pull-requests`.
   */
  public data object PullRequests : InlineWebhookSecretScanningScanCompletedSourceXa3384f41() {
    public override val `value`: String = "pull-requests"
  }

  /**
   * Documented value. Wire value: `discussions`.
   */
  public data object Discussions : InlineWebhookSecretScanningScanCompletedSourceXa3384f41() {
    public override val `value`: String = "discussions"
  }

  /**
   * Documented value. Wire value: `wiki`.
   */
  public data object Wiki : InlineWebhookSecretScanningScanCompletedSourceXa3384f41() {
    public override val `value`: String = "wiki"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningScanCompletedSourceXa3384f41()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningScanCompletedSourceXa3384f41 = when (value) {
      Git.value -> Git
      Issues.value -> Issues
      PullRequests.value -> PullRequests
      Discussions.value -> Discussions
      Wiki.value -> Wiki
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningScanCompletedSourceXa3384f41> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningScanCompletedSourceXa3384f41", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningScanCompletedSourceXa3384f41 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningScanCompletedSourceXa3384f41) {
      encoder.encodeString(value.value)
    }
  }
}
