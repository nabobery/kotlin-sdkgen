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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations/post/requestBody/content/application~1json/schema/prope
 * rties/exclude/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations/post/requestBody/content/application~1json/schema/prope
 * rties/exclude/items
 */
@Serializable(with = InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445.Serializer::class)
public sealed class InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repositories`.
   */
  public data object Repositories : InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445() {
    public override val `value`: String = "repositories"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445 = when (value) {
      Repositories.value -> Repositories
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMigrationsPostRequestJsonExcludeItemX46b27445) {
      encoder.encodeString(value.value)
    }
  }
}
