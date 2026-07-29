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
 * Visibility of a variable
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-actions-variable/properties/visibility
 */
@Serializable(with = InlineOrganizationActionsVariableVisibilityX1dc298e6.Serializer::class)
public sealed class InlineOrganizationActionsVariableVisibilityX1dc298e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrganizationActionsVariableVisibilityX1dc298e6() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrganizationActionsVariableVisibilityX1dc298e6() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrganizationActionsVariableVisibilityX1dc298e6() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationActionsVariableVisibilityX1dc298e6()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationActionsVariableVisibilityX1dc298e6 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationActionsVariableVisibilityX1dc298e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationActionsVariableVisibilityX1dc298e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationActionsVariableVisibilityX1dc298e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationActionsVariableVisibilityX1dc298e6) {
      encoder.encodeString(value.value)
    }
  }
}
