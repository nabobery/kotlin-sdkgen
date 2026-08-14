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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/get/parameters/3/schema
 */
@Serializable(with = InlineReposIssuesGetParameterX6e5adb32.Serializer::class)
public sealed class InlineReposIssuesGetParameterX6e5adb32 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposIssuesGetParameterX6e5adb32() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposIssuesGetParameterX6e5adb32() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposIssuesGetParameterX6e5adb32() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesGetParameterX6e5adb32()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesGetParameterX6e5adb32 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposIssuesGetParameterX6e5adb32> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposIssuesGetParameterX6e5adb32", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesGetParameterX6e5adb32 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesGetParameterX6e5adb32) {
      encoder.encodeString(value.value)
    }
  }
}
