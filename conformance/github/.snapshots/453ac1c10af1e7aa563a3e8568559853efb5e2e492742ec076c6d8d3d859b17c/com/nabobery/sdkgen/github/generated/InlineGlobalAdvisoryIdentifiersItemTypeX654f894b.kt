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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/identifiers/items/properties/type
 */
@Serializable(with = InlineGlobalAdvisoryIdentifiersItemTypeX654f894b.Serializer::class)
public sealed class InlineGlobalAdvisoryIdentifiersItemTypeX654f894b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `CVE`.
   */
  public data object Cve : InlineGlobalAdvisoryIdentifiersItemTypeX654f894b() {
    public override val `value`: String = "CVE"
  }

  /**
   * Documented value. Wire value: `GHSA`.
   */
  public data object Ghsa : InlineGlobalAdvisoryIdentifiersItemTypeX654f894b() {
    public override val `value`: String = "GHSA"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGlobalAdvisoryIdentifiersItemTypeX654f894b()

  public companion object {
    public fun fromValue(`value`: String): InlineGlobalAdvisoryIdentifiersItemTypeX654f894b = when (value) {
      Cve.value -> Cve
      Ghsa.value -> Ghsa
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGlobalAdvisoryIdentifiersItemTypeX654f894b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGlobalAdvisoryIdentifiersItemTypeX654f894b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisoryIdentifiersItemTypeX654f894b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisoryIdentifiersItemTypeX654f894b) {
      encoder.encodeString(value.value)
    }
  }
}
