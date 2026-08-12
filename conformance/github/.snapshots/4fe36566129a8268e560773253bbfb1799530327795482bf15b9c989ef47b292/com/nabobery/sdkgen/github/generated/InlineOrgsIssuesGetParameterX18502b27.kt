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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1issues/get/parameters/2/schema
 */
@Serializable(with = InlineOrgsIssuesGetParameterX18502b27.Serializer::class)
public sealed class InlineOrgsIssuesGetParameterX18502b27 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineOrgsIssuesGetParameterX18502b27() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineOrgsIssuesGetParameterX18502b27() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsIssuesGetParameterX18502b27() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsIssuesGetParameterX18502b27()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsIssuesGetParameterX18502b27 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsIssuesGetParameterX18502b27> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsIssuesGetParameterX18502b27", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsIssuesGetParameterX18502b27 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsIssuesGetParameterX18502b27) {
      encoder.encodeString(value.value)
    }
  }
}
