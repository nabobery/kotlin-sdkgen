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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/RoutingStrategy.
 */
@Serializable(with = RoutingStrategy.Serializer::class)
public sealed class RoutingStrategy {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : RoutingStrategy() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : RoutingStrategy() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `free`.
   */
  public data object Free : RoutingStrategy() {
    public override val `value`: String = "free"
  }

  /**
   * Documented value. Wire value: `latest`.
   */
  public data object Latest : RoutingStrategy() {
    public override val `value`: String = "latest"
  }

  /**
   * Documented value. Wire value: `alias`.
   */
  public data object Alias : RoutingStrategy() {
    public override val `value`: String = "alias"
  }

  /**
   * Documented value. Wire value: `fallback`.
   */
  public data object Fallback : RoutingStrategy() {
    public override val `value`: String = "fallback"
  }

  /**
   * Documented value. Wire value: `pareto`.
   */
  public data object Pareto : RoutingStrategy() {
    public override val `value`: String = "pareto"
  }

  /**
   * Documented value. Wire value: `bodybuilder`.
   */
  public data object Bodybuilder : RoutingStrategy() {
    public override val `value`: String = "bodybuilder"
  }

  /**
   * Documented value. Wire value: `fusion`.
   */
  public data object Fusion : RoutingStrategy() {
    public override val `value`: String = "fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : RoutingStrategy()

  public companion object {
    public fun fromValue(`value`: String): RoutingStrategy = when (value) {
      Direct.value -> Direct
      Auto.value -> Auto
      Free.value -> Free
      Latest.value -> Latest
      Alias.value -> Alias
      Fallback.value -> Fallback
      Pareto.value -> Pareto
      Bodybuilder.value -> Bodybuilder
      Fusion.value -> Fusion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<RoutingStrategy> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.RoutingStrategy", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): RoutingStrategy = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: RoutingStrategy) {
      encoder.encodeString(value.value)
    }
  }
}
