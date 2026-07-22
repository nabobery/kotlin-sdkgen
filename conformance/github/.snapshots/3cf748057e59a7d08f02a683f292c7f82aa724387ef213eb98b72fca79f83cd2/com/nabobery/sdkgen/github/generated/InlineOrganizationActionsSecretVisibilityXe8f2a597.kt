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
 * Visibility of a secret
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-actions-secret/properties/visibility
 */
@Serializable(with = InlineOrganizationActionsSecretVisibilityXe8f2a597.Serializer::class)
public sealed class InlineOrganizationActionsSecretVisibilityXe8f2a597 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationActionsSecretVisibilityXe8f2a597() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrganizationActionsSecretVisibilityXe8f2a597() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrganizationActionsSecretVisibilityXe8f2a597() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationActionsSecretVisibilityXe8f2a597()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationActionsSecretVisibilityXe8f2a597 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationActionsSecretVisibilityXe8f2a597> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationActionsSecretVisibilityXe8f2a597", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationActionsSecretVisibilityXe8f2a597 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationActionsSecretVisibilityXe8f2a597) {
      encoder.encodeString(value.value)
    }
  }
}
