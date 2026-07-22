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
 * Allowed values that can be passed to the exclude param.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1migrations/post/requestBody/content/application~1json/schema/properties/e
 * xclude/items
 */
@Serializable(with = InlineUserMigrationsPostRequestJsonExcludeItemX571d7366.Serializer::class)
public sealed class InlineUserMigrationsPostRequestJsonExcludeItemX571d7366 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repositories`.
   */
  public data object Repositories : InlineUserMigrationsPostRequestJsonExcludeItemX571d7366() {
    public override val `value`: String = "repositories"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserMigrationsPostRequestJsonExcludeItemX571d7366()

  public companion object {
    public fun fromValue(`value`: String): InlineUserMigrationsPostRequestJsonExcludeItemX571d7366 = when (value) {
      Repositories.value -> Repositories
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserMigrationsPostRequestJsonExcludeItemX571d7366> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserMigrationsPostRequestJsonExcludeItemX571d7366", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserMigrationsPostRequestJsonExcludeItemX571d7366 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserMigrationsPostRequestJsonExcludeItemX571d7366) {
      encoder.encodeString(value.value)
    }
  }
}
