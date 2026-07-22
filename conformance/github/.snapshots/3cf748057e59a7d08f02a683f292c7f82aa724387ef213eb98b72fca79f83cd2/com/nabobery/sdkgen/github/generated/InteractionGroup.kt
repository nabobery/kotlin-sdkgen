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
 * The type of GitHub user that can comment, open issues, or create pull requests while the interaction limit is in
 * effect.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/interaction-group
 */
@Serializable(with = InteractionGroup.Serializer::class)
public sealed class InteractionGroup {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing_users`.
   */
  public data object ExistingUsers : InteractionGroup() {
    public override val `value`: String = "existing_users"
  }

  /**
   * Documented value. Wire value: `contributors_only`.
   */
  public data object ContributorsOnly : InteractionGroup() {
    public override val `value`: String = "contributors_only"
  }

  /**
   * Documented value. Wire value: `collaborators_only`.
   */
  public data object CollaboratorsOnly : InteractionGroup() {
    public override val `value`: String = "collaborators_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InteractionGroup()

  public companion object {
    public fun fromValue(`value`: String): InteractionGroup = when (value) {
      ExistingUsers.value -> ExistingUsers
      ContributorsOnly.value -> ContributorsOnly
      CollaboratorsOnly.value -> CollaboratorsOnly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InteractionGroup> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InteractionGroup", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InteractionGroup = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InteractionGroup) {
      encoder.encodeString(value.value)
    }
  }
}
