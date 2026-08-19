package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * **DEPRECATED** Use providers.sort.partition instead. Backwards-compatible alias for providers.sort.partition. Accepts
 * legacy values: "fallback" (maps to "model"), "sort" (maps to "none").
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/DeprecatedRoute
 */
@Serializable(with = DeprecatedRoute.Serializer::class)
public sealed class DeprecatedRoute {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fallback`.
   */
  public data object Fallback : DeprecatedRoute() {
    public override val `value`: String = "fallback"
  }

  /**
   * Documented value. Wire value: `sort`.
   */
  public data object Sort : DeprecatedRoute() {
    public override val `value`: String = "sort"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : DeprecatedRoute()

  public companion object {
    public fun fromValue(`value`: String): DeprecatedRoute = when (value) {
      Fallback.value -> Fallback
      Sort.value -> Sort
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<DeprecatedRoute> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.DeprecatedRoute", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): DeprecatedRoute = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: DeprecatedRoute) {
      encoder.encodeString(value.value)
    }
  }
}
