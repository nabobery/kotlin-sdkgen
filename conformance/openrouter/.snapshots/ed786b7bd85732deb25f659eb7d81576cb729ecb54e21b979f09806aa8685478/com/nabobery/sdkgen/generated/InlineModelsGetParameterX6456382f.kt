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
 * Filter models by use case category
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1models/get/parameters/2/schema
 */
@Serializable(with = InlineModelsGetParameterX6456382f.Serializer::class)
public sealed class InlineModelsGetParameterX6456382f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `programming`.
   */
  public data object Programming : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "programming"
  }

  /**
   * Documented value. Wire value: `roleplay`.
   */
  public data object Roleplay : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "roleplay"
  }

  /**
   * Documented value. Wire value: `marketing`.
   */
  public data object Marketing : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "marketing"
  }

  /**
   * Documented value. Wire value: `marketing/seo`.
   */
  public data object MarketingSeo : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "marketing/seo"
  }

  /**
   * Documented value. Wire value: `technology`.
   */
  public data object Technology : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "technology"
  }

  /**
   * Documented value. Wire value: `science`.
   */
  public data object Science : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "science"
  }

  /**
   * Documented value. Wire value: `translation`.
   */
  public data object Translation : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "translation"
  }

  /**
   * Documented value. Wire value: `legal`.
   */
  public data object Legal : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "legal"
  }

  /**
   * Documented value. Wire value: `finance`.
   */
  public data object Finance : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "finance"
  }

  /**
   * Documented value. Wire value: `health`.
   */
  public data object Health : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "health"
  }

  /**
   * Documented value. Wire value: `trivia`.
   */
  public data object Trivia : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "trivia"
  }

  /**
   * Documented value. Wire value: `academia`.
   */
  public data object Academia : InlineModelsGetParameterX6456382f() {
    public override val `value`: String = "academia"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModelsGetParameterX6456382f()

  public companion object {
    public fun fromValue(`value`: String): InlineModelsGetParameterX6456382f = when (value) {
      Programming.value -> Programming
      Roleplay.value -> Roleplay
      Marketing.value -> Marketing
      MarketingSeo.value -> MarketingSeo
      Technology.value -> Technology
      Science.value -> Science
      Translation.value -> Translation
      Legal.value -> Legal
      Finance.value -> Finance
      Health.value -> Health
      Trivia.value -> Trivia
      Academia.value -> Academia
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModelsGetParameterX6456382f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineModelsGetParameterX6456382f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModelsGetParameterX6456382f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModelsGetParameterX6456382f) {
      encoder.encodeString(value.value)
    }
  }
}
