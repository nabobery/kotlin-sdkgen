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
 */
@Serializable(with = InlinePathsModelsGetParameters2Schema.Serializer::class)
public sealed class InlinePathsModelsGetParameters2Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `programming`.
   */
  public data object Programming : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "programming"
  }

  /**
   * Documented value. Wire value: `roleplay`.
   */
  public data object Roleplay : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "roleplay"
  }

  /**
   * Documented value. Wire value: `marketing`.
   */
  public data object Marketing : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "marketing"
  }

  /**
   * Documented value. Wire value: `marketing/seo`.
   */
  public data object MarketingSeo : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "marketing/seo"
  }

  /**
   * Documented value. Wire value: `technology`.
   */
  public data object Technology : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "technology"
  }

  /**
   * Documented value. Wire value: `science`.
   */
  public data object Science : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "science"
  }

  /**
   * Documented value. Wire value: `translation`.
   */
  public data object Translation : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "translation"
  }

  /**
   * Documented value. Wire value: `legal`.
   */
  public data object Legal : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "legal"
  }

  /**
   * Documented value. Wire value: `finance`.
   */
  public data object Finance : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "finance"
  }

  /**
   * Documented value. Wire value: `health`.
   */
  public data object Health : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "health"
  }

  /**
   * Documented value. Wire value: `trivia`.
   */
  public data object Trivia : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "trivia"
  }

  /**
   * Documented value. Wire value: `academia`.
   */
  public data object Academia : InlinePathsModelsGetParameters2Schema() {
    public override val `value`: String = "academia"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsModelsGetParameters2Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsModelsGetParameters2Schema = when (value) {
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

  public object Serializer : KSerializer<InlinePathsModelsGetParameters2Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters2Schema", PrimitiveKind
          .STRING)

    override fun deserialize(decoder: Decoder): InlinePathsModelsGetParameters2Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsModelsGetParameters2Schema) {
      encoder.encodeString(value.value)
    }
  }
}
