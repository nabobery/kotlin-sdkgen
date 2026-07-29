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
 * The type of advisory identifier.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/identifiers/items/prop
 * erties/type
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9.Serializer::class)
public sealed class InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `CVE`.
   */
  public data object Cve : InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9() {
    public override val `value`: String = "CVE"
  }

  /**
   * Documented value. Wire value: `GHSA`.
   */
  public data object Ghsa : InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9() {
    public override val `value`: String = "GHSA"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9 = when (value) {
      Cve.value -> Cve
      Ghsa.value -> Ghsa
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryIdentifiersItemTypeXa8922ae9) {
      encoder.encodeString(value.value)
    }
  }
}
