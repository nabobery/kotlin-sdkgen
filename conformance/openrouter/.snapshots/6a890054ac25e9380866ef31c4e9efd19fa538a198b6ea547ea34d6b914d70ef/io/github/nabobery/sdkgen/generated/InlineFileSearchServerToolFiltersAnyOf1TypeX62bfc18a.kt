package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters/anyOf/0/properties/type
 */
@Serializable(with = InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a.Serializer::class)
public sealed class InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eq`.
   */
  public data object Eq : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "eq"
  }

  /**
   * Documented value. Wire value: `ne`.
   */
  public data object Ne : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "ne"
  }

  /**
   * Documented value. Wire value: `gt`.
   */
  public data object Gt : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "gt"
  }

  /**
   * Documented value. Wire value: `gte`.
   */
  public data object Gte : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "gte"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `lte`.
   */
  public data object Lte : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a() {
    public override val `value`: String = "lte"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a()

  public companion object {
    public fun fromValue(`value`: String): InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a = when (value) {
      Eq.value -> Eq
      Ne.value -> Ne
      Gt.value -> Gt
      Gte.value -> Gte
      Lt.value -> Lt
      Lte.value -> Lte
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a) {
      encoder.encodeString(value.value)
    }
  }
}
