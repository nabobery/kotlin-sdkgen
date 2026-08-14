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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls/get/parameters/6/schema
 */
@Serializable(with = InlineReposPullsGetParameterXd8f86f5c.Serializer::class)
public sealed class InlineReposPullsGetParameterXd8f86f5c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineReposPullsGetParameterXd8f86f5c() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineReposPullsGetParameterXd8f86f5c() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsGetParameterXd8f86f5c()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsGetParameterXd8f86f5c = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsGetParameterXd8f86f5c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsGetParameterXd8f86f5c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsGetParameterXd8f86f5c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsGetParameterXd8f86f5c) {
      encoder.encodeString(value.value)
    }
  }
}
