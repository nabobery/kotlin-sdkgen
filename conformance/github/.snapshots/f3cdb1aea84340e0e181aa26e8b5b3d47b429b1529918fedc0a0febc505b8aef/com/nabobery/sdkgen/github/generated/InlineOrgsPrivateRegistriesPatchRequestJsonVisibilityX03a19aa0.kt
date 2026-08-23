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
 * Which type of organization repositories have access to the private registry. `selected` means only the repositories
 * specified by `selected_repository_ids` can access the private registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1{secret_name}/patch/requestBody/content/applic
 * ation~1json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0) {
      encoder.encodeString(value.value)
    }
  }
}
