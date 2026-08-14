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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/3/schema
 */
@Serializable(with = InlineOrgsReposGetParameterX32c38515.Serializer::class)
public sealed class InlineOrgsReposGetParameterX32c38515 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineOrgsReposGetParameterX32c38515() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineOrgsReposGetParameterX32c38515() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposGetParameterX32c38515()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposGetParameterX32c38515 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposGetParameterX32c38515> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsReposGetParameterX32c38515", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposGetParameterX32c38515 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposGetParameterX32c38515) {
      encoder.encodeString(value.value)
    }
  }
}
