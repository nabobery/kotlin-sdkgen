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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1issues/get/parameters/1/schema
 */
@Serializable(with = InlineIssuesGetParameterX64f67606.Serializer::class)
public sealed class InlineIssuesGetParameterX64f67606 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineIssuesGetParameterX64f67606() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineIssuesGetParameterX64f67606() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineIssuesGetParameterX64f67606() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuesGetParameterX64f67606()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuesGetParameterX64f67606 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuesGetParameterX64f67606> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineIssuesGetParameterX64f67606", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuesGetParameterX64f67606 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuesGetParameterX64f67606) {
      encoder.encodeString(value.value)
    }
  }
}
