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
 * The level of permission to grant the access token for issues and related comments, assignees, labels, and milestones.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/issues
 */
@Serializable(with = InlineAppPermissionsIssuesX1ab90ca1.Serializer::class)
public sealed class InlineAppPermissionsIssuesX1ab90ca1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsIssuesX1ab90ca1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsIssuesX1ab90ca1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsIssuesX1ab90ca1()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsIssuesX1ab90ca1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsIssuesX1ab90ca1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsIssuesX1ab90ca1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsIssuesX1ab90ca1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsIssuesX1ab90ca1) {
      encoder.encodeString(value.value)
    }
  }
}
