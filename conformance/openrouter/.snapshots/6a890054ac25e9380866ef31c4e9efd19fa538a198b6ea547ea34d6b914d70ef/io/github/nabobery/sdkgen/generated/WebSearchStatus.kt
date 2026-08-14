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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchStatus.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchStatus
 */
@Serializable(with = WebSearchStatus.Serializer::class)
public sealed class WebSearchStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : WebSearchStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `searching`.
   */
  public data object Searching : WebSearchStatus() {
    public override val `value`: String = "searching"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : WebSearchStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : WebSearchStatus() {
    public override val `value`: String = "failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WebSearchStatus()

  public companion object {
    public fun fromValue(`value`: String): WebSearchStatus = when (value) {
      Completed.value -> Completed
      Searching.value -> Searching
      InProgress.value -> InProgress
      Failed.value -> Failed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<WebSearchStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.WebSearchStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WebSearchStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WebSearchStatus) {
      encoder.encodeString(value.value)
    }
  }
}
