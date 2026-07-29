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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-update/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-update/properties/type
 */
@Serializable(with = InlineRepositoryRuleUpdateTypeX6cbd920c.Serializer::class)
public sealed class InlineRepositoryRuleUpdateTypeX6cbd920c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `update`.
   */
  public data object Update : InlineRepositoryRuleUpdateTypeX6cbd920c() {
    public override val `value`: String = "update"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleUpdateTypeX6cbd920c()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleUpdateTypeX6cbd920c = when (value) {
      Update.value -> Update
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleUpdateTypeX6cbd920c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleUpdateTypeX6cbd920c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleUpdateTypeX6cbd920c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleUpdateTypeX6cbd920c) {
      encoder.encodeString(value.value)
    }
  }
}
