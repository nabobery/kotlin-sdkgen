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
 * The state that the membership should be in. Only `"active"` will be accepted.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1memberships~1orgs~1{org}/patch/requestBody/content/application~1json/sche
 * ma/properties/state
 */
@Serializable(with = InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf.Serializer::class)
public sealed class InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf() {
    public override val `value`: String = "active"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf()

  public companion object {
    public fun fromValue(`value`: String): InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf = when (value) {
      Active.value -> Active
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserMembershipsOrgsPatchRequestJsonStateXc6f7f1cf) {
      encoder.encodeString(value.value)
    }
  }
}
