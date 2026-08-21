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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/per/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/per/schema
 */
@Serializable(with = InlinePerParameterX13042cdb.Serializer::class)
public sealed class InlinePerParameterX13042cdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlinePerParameterX13042cdb() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlinePerParameterX13042cdb() {
    public override val `value`: String = "week"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePerParameterX13042cdb()

  public companion object {
    public fun fromValue(`value`: String): InlinePerParameterX13042cdb = when (value) {
      Day.value -> Day
      Week.value -> Week
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePerParameterX13042cdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePerParameterX13042cdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePerParameterX13042cdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePerParameterX13042cdb) {
      encoder.encodeString(value.value)
    }
  }
}
