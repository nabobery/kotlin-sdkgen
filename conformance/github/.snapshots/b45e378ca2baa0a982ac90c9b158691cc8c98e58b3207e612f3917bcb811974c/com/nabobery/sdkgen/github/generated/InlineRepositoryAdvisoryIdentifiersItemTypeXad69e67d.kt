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
 * The type of identifier.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/identifiers/items/properties/type
 */
@Serializable(with = InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d.Serializer::class)
public sealed class InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `CVE`.
   */
  public data object Cve : InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d() {
    public override val `value`: String = "CVE"
  }

  /**
   * Documented value. Wire value: `GHSA`.
   */
  public data object Ghsa : InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d() {
    public override val `value`: String = "GHSA"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d = when (value) {
      Cve.value -> Cve
      Ghsa.value -> Ghsa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d) {
      encoder.encodeString(value.value)
    }
  }
}
