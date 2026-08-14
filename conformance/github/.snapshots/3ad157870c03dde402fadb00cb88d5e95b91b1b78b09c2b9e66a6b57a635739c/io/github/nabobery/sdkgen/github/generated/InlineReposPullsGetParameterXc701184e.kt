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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/2/schema
 */
@Serializable(with = InlineReposPullsGetParameterXc701184e.Serializer::class)
public sealed class InlineReposPullsGetParameterXc701184e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposPullsGetParameterXc701184e() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposPullsGetParameterXc701184e() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineReposPullsGetParameterXc701184e() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsGetParameterXc701184e()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsGetParameterXc701184e = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsGetParameterXc701184e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXc701184e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsGetParameterXc701184e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsGetParameterXc701184e) {
      encoder.encodeString(value.value)
    }
  }
}
